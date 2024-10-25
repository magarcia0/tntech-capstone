"use client"
import { useEffect, useState } from 'react';
import { fetchData } from '../services/apiService';
import DataTable from '@/components/DataTable/DataTable';

export default function Home() {

  const [data, setData] = useState();
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const loadData = async () => {
      try {
        const result = await fetchData('/data');
        setData(result);
      } catch (error) {
        console.error('Error loading data:', error);
      } finally {
        setLoading(false);
      }
    };
    loadData();
  }, []);


  if (loading) return <div>Loading...</div>;

  return (
    <div>
      <DataTable data={data} />
    </div>
  );
};
